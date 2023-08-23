# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
  @spec is_valid_bst(root :: TreeNode.t() | nil) :: boolean
  def is_valid_bst(root) do
    validate(root, nil, nil)
  end

  defp validate(nil, _min, _max) do
    true
  end

  defp validate(node, min, max) do
    if check_range(node.val, get_min(min, node.val), max) do
      validate(node.left, get_min(min, node.val), node.val) and
        validate(node.right, node.val, get_max(max, node.val))
    else
      false
    end
  end

  defp get_min(nil, _parent_val), do: nil
  defp get_min(prev_min, parent_val), do: min(prev_min, parent_val)

  defp get_max(nil, _parent_val), do: nil
  defp get_max(prev_max, parent_val), do: max(prev_max, parent_val)

  defp check_range(_val, nil, nil), do: true
  defp check_range(val, nil, max), do: val < max
  defp check_range(val, min, nil), do: val > min
  defp check_range(val, min, max), do: min < val and val < max
end
