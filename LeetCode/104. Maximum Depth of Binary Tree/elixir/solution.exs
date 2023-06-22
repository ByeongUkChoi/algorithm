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
  @spec max_depth(root :: TreeNode.t() | nil) :: integer
  def max_depth(root) do
    get_depth(root)
  end

  defp get_depth(node, depth \\ 0)

  defp get_depth(nil, depth) do
    depth
  end

  defp get_depth(%{left: l_node, right: r_node}, depth) do
    max(get_depth(l_node, depth + 1), get_depth(r_node, depth + 1))
  end
end
