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
  @spec sum_root_to_leaf(root :: TreeNode.t() | nil) :: integer
  def sum_root_to_leaf(root) do
    sum_leaf(root)
  end

  defp sum_leaf(node, acc \\ [])

  defp sum_leaf(nil, _acc) do
    0
  end

  defp sum_leaf(%{val: val, left: nil, right: nil}, acc) do
    [val | acc] |> Enum.reverse() |> Enum.join() |> Integer.parse(2) |> elem(0)
  end

  defp sum_leaf(%{val: val, left: left, right: right}, acc) do
    new_acc = [val | acc]
    sum_leaf(left, new_acc) + sum_leaf(right, new_acc)
  end
end
